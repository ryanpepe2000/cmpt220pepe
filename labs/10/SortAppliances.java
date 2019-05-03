import java.util.ArrayList;
import java.util.Collections;

public class SortAppliances {

	public static void main(String[] args) {
		Appliance[] appliances = new Appliance[40];
		
		appliances[0] = new Toaster(2232445, false, 2.3, 25.00);
		appliances[1] = new Toaster(232424, true, 4.6, 150.00);
		appliances[2] = new Toaster(24625236, false, 1.1, 15);
		appliances[3] = new Toaster(15124, true, 3.7, 80);
		appliances[4] = new TV(1280, 720, true, 200);
		appliances[5] = new TV(3840, 4320, true, 2000);
		appliances[6] = new Toaster(2424, true, 1.3, 17.00);
		appliances[7] = new Toaster(124815, true, 5.0, 300.00);
		appliances[8] = new Toaster(21513, false, 1.0, 10);
		appliances[9] = new Toaster(87249, true, 3.7, 95);
		appliances[10] = new TV(1280, 720, true, 150);
		appliances[11] = new TV(3840, 4320, true, 1800);
		appliances[12] = new Toaster(24636, false, 1.1, 23);
		appliances[13] = new Toaster(236246, true, 3.7, 93);
		appliances[14] = new TV(1920, 1080, true, 1000);
		appliances[15] = new TV(3840, 4320, true, 1830);
		appliances[16] = new Toaster(2424, true, 1.3, 28.00);
		appliances[17] = new Toaster(124815, true, 5.0, 280.00);
		appliances[18] = new Toaster(21513, false, 1.0, 18);
		appliances[19] = new Toaster(87249, true, 3.7, 100);
		appliances[20] = new TV(1280, 720, true, 200);
		appliances[21] = new TV(3840, 4320, true, 1600);
		appliances[22] = new Telephone("Verizon", "Apple", 5550234, 299);
		appliances[23] = new Telephone("Sprint", "Samsung", 5552429, 150);
		appliances[24] = new Telephone("AT&T", "Apple", 5552623, 999);
		appliances[25] = new Telephone("Verizon", "Android", 5551121, 100);
		appliances[26] = new TV(1920, 1080, true, 800);
		appliances[27] = new TV(3840, 4320, true, 2500);
		appliances[28] = new Toaster(2424, true, 1.4, 30.00);
		appliances[29] = new Toaster(124815, true, 5.0, 180.00);
		appliances[30] = new Toaster(21513, false, 1.0, 28);
		appliances[31] = new Toaster(87249, true, 3.7, 120);
		appliances[32] = new TV(1280, 720, true, 300);
		appliances[33] = new TV(3840, 4320, true, 2300);
		appliances[34] = new Telephone("Verizon", "Apple", 5558237, 250);
		appliances[35] = new Telephone("Sprint", "Samsung", 5552134, 120);
		appliances[36] = new Telephone("AT&T", "Apple", 5552223, 600);
		appliances[37] = new Telephone("Verizon", "Android", 5551221, 99);
		appliances[38] = new TV(1280, 720, true, 200);
		appliances[39] = new TV(7680,4320, true, 16000);

		ArrayList<Appliance> applianceList = new ArrayList<>();
		for (int i = 0; i < 40; i++) 
			applianceList.add(appliances[i]);
		
		Collections.sort(applianceList);
		
		for (int i = 0; i<40; i++) {
			System.out.println(applianceList.toArray()[i]);
		}
	}

}
