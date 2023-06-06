package sem2_task2;

import sem2.Actor;

import java.util.List;

public interface MarketBahaviour {
    void acceptToMarket(Actor actor); // доступ(вход) к маркету
    void releaseFromMarket(List<Actor> actors); // выход из маркета
    void update(); //

}
