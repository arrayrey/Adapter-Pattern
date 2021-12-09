interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notif(String n);
}

//interface Observable dari class Company