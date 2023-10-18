package chap10_State;

public interface State {


    public void insertQuarter(); // 동전이 들어올 때 해야할 일
    public void ejectQuarter(); // 동전을 반환할 때 해야할 일
    public void turnCrank(); // 손잡이가 돌아갔을 때 해야할 일
    public void dispense(); // 알맹이를 내보낼 때 해야할 일

    public void refill(); // 리필할 때 해야할 일

}
