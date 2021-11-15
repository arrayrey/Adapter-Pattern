class MainSound {
    public static void main (String[] args) {
        Kucing kucing = new Miaw();

        Bebek miawAdapter = new MiawAdapter(kucing);
        System.out.println("Kweekk Kwek!!!");
        miawAdapter.kweek();
    }
}