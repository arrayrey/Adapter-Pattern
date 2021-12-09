import java.util.ArrayList; //import array list untuk mengubah data

public class Company implements Observable { //implements class Observable
    private ArrayList<Observer> cli = new ArrayList<>(); //create new object untuk semua method yang diberikan pada client
    
    //overide method class Observable
    @Override
    public void addObserver(Observer observer) {
        cli.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        cli.remove(observer);
    }

    @Override
    public void notif(String n) {
        for (Observer client : cli) {
            client.update(n);
        }
    }
}

//class subject design observer, subject tersebut ialah Company