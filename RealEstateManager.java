import java.util.ArrayList;
import java.util.List;

public class RealEstateManager {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public RealEstateManager() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();
        // Adding sample houses, villas, and summer houses
        houseList.add(new House(300000, 100, 3, 1));
        houseList.add(new House(350000, 120, 4, 1));
        houseList.add(new House(400000, 140, 5, 2));

        villaList.add(new Villa(500000, 200, 4, 2));
        villaList.add(new Villa(600000, 250, 5, 2));
        villaList.add(new Villa(700000, 300, 6, 3));

        summerHouseList.add(new SummerHouse(250000, 90, 2, 1));
        summerHouseList.add(new SummerHouse(300000, 100, 3, 1));
        summerHouseList.add(new SummerHouse(350000, 110, 3, 1));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
