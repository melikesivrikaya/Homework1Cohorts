import java.util.List;

public class Main {
    public static void main(String[] args) {
        RealEstateService realEstateService = new RealEstateService(new RealEstateManager());


        // Evlerin toplam fiyatını loglama
        double totalHousePrice = realEstateService.getTotalHousePrice();
        System.out.println("Total Price of Houses: " + totalHousePrice);

        // Villaların toplam fiyatını loglama
        double totalVillaPrice = realEstateService.getTotalVillaPrice();
        System.out.println("Total Price of Villas: " + totalVillaPrice);

        // Yazlıkların toplam fiyatını loglama
        double totalSummerHousePrice = realEstateService.getTotalSummerHousePrice();
        System.out.println("Total Price of Summer Houses: " + totalSummerHousePrice);

        // Tüm evlerin toplam fiyatını loglama
        double totalAllPropertiesPrice = realEstateService.getTotalPriceOfAllProperties();
        System.out.println("Total Price of All Properties: " + totalAllPropertiesPrice);

        // Evlerin ortalama metrekaresini loglama
        double averageHouseSquareMeters = realEstateService.getAverageHouseSquareMeters();
        System.out.println("Average Square Meters of Houses: " + averageHouseSquareMeters);

        // Villaların ortalama metrekaresini loglama
        double averageVillaSquareMeters = realEstateService.getAverageVillaSquareMeters();
        System.out.println("Average Square Meters of Villas: " + averageVillaSquareMeters);

        // Yazlıkların ortalama metrekaresini loglama
        double averageSummerHouseSquareMeters = realEstateService.getAverageSummerHouseSquareMeters();
        System.out.println("Average Square Meters of Summer Houses: " + averageSummerHouseSquareMeters);

        // Tüm evlerin ortalama metrekaresini loglama
        double averageAllPropertiesSquareMeters = realEstateService.getAverageSquareMetersOfAllProperties();
        System.out.println("Average Square Meters of All Properties: " + averageAllPropertiesSquareMeters);

        // Belirli oda ve salon sayısına göre evleri filtreleme ve loglama
        int filterRooms = 3;
        int filterLivingRooms = 1;
        List<House> filteredProperties = realEstateService.filterByRoomsAndLivingRooms(filterRooms, filterLivingRooms);
        System.out.println("Filtered Properties with " + filterRooms + " Rooms and " + filterLivingRooms + " Living Room(s):");

        for (House house : filteredProperties) {
            System.out.println(" - Price: " + house.getPrice() + ", Square Meters: " + house.getSquareMeters() + " , Rooms: " + house.getNumberOfRooms() + ", Living Rooms: " + house.getNumberOfLivingRooms());
        }

    }
}