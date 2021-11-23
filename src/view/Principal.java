package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import controller.SteamController;

public class Principal {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\rickl\\Documents\\SteamCharts.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			SteamController encontraJogo = new SteamController(2020, "November", 55087.89);
				
				while(line != null){
					if(line.contains("November") && line.contains("2020") && line.contains("55087.89")){
						System.out.println(encontraJogo.toString());
					}
					
					line = br.readLine();
			}
		} catch (IOException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
