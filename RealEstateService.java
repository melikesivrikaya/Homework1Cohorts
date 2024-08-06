import java.util.ArrayList;
import java.util.List;

public class RealEstateService {
    private RealEstateManager realEstateManager;

    public RealEstateService(RealEstateManager realEstateManager) {
        this.realEstateManager = realEstateManager;
    }

    public double getTotalHousePrice() {
        return realEstateManager.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalVillaPrice() {
        return realEstateManager.getVillaList().stream().mapToDouble(Villa::getPrice).sum();
    }

    public double getTotalSummerHousePrice() {
        return realEstateManager.getSummerHouseList().stream().mapToDouble(SummerHouse::getPrice).sum();
    }

    public double getTotalPriceOfAllProperties() {
        double totalPrice = getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
        return totalPrice;
    }

    public double getAverageHouseSquareMeters() {
        return realEstateManager.getHouseList().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageVillaSquareMeters() {
        return realEstateManager.getVillaList().stream().mapToDouble(Villa::getSquareMeters).average().orElse(0);
    }

    public double getAverageSummerHouseSquareMeters() {
        return realEstateManager.getSummerHouseList().stream().mapToDouble(SummerHouse::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllProperties() {
        double totalSquareMeters = realEstateManager.getHouseList().stream().mapToDouble(House::getSquareMeters).sum()
                + realEstateManager.getVillaList().stream().mapToDouble(Villa::getSquareMeters).sum()
                + realEstateManager.getSummerHouseList().stream().mapToDouble(SummerHouse::getSquareMeters).sum();

        long totalProperties = realEstateManager.getHouseList().size()
                + realEstateManager.getVillaList().size()
                + realEstateManager.getSummerHouseList().size();

        return totalProperties > 0 ? totalSquareMeters / totalProperties : 0;
    }

    public List<House> filterByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<House> allProperties = new ArrayList<>();
        allProperties.addAll(realEstateManager.getHouseList());
        allProperties.addAll(realEstateManager.getVillaList());
        allProperties.addAll(realEstateManager.getSummerHouseList());

        return allProperties.stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfLivingRooms() == numberOfLivingRooms)
                .toList();
    }
}
