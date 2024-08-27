public class MainHotel {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        service.tambah(new Hotel("Hotel A", "Jakarta", 100000, (byte) 3));
        service.tambah(new Hotel("Hotel B", "Malang", 80000, (byte) 4));
        service.tambah(new Hotel("Hotel C", "Yogyakarta", 120000, (byte) 5));
        service.tambah(new Hotel("Hotel D", "Batu", 150000, (byte) 2));

        System.out.println("Sebelum sorting:");
        service.tampilAll();

        System.out.println("\nSorting harga menggunakan Bubble Sort:");
        service.bubbleSortHarga();
        service.tampilAll();

        System.out.println("\nSorting bintang menggunakan Selection Sort:");
        service.selectionSortBintang();
        service.tampilAll();
    }
}
