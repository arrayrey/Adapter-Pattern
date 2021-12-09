class Main {
    public static void main (String[] args) {
         
        Observable admin = new Company(); //create new object dari class Company
        //create 4 object sebagai observer
        Observer cli1 = new Client("Francess");
        Observer cli2 = new Client("Liberi");
        Observer cli3 = new Client("Sergio");
        Observer cli4 = new Client("Array");

        admin.addObserver(cli1);
        admin.addObserver(cli2);
        admin.addObserver(cli3);
        admin.addObserver(cli4);

        admin.notif("has been launched. "); //memanggil notifikasi yang disebarkan subject
    }
}


// Ring Jewelry (Perhiasan Cincin)
// 
// Client akan mendapatkan notifikasi terkait model-model cincin terbaru yang dirilis. 
// Model dari cincin yang dirilis berupa Diamond Ring (Cincin Berlian) dan Giok's Ring (Cincin Giok).
// 
