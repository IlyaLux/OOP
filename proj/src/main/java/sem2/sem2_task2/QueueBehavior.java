package sem2.sem2_task2;

import sem2.task1.Actor;

public interface QueueBehavior {
    void takeInQueue(Actor actor); // добавление в очередь
    void takeOrders(); // забрать заказ и выйти из очереди
    void giveOrders();
    void releaseFromQueue(); // выход из очереди

}
