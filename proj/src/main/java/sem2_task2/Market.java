package sem2_task2;

import sem2.Actor;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBahaviour, QueueBehavior {
    private final List<Actor> actors;

    public Market(List<Actor> actors) {
        actors = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин.");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина.");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + "встал в очередь.");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: queue){
            if (!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ.");

            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: queue){
            if (actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor: queue){
            if (actor.isTakeOrder()){
                releaseActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить.");
            }
        }
        releaseFromMarket(releaseActors);
    }
}
