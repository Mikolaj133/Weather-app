package com.weather.updater;

import com.weather.weatherdata.model.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LocationFileReader {
    private static final Logger logger = LoggerFactory.getLogger(LocationFileReader.class);
    private static String filepath = "classpath:locations.csv";

    public static String getRawFileData() throws IOException {
        try (InputStream inputStream = LocationFileReader.class.getClassLoader().getResourceAsStream("locations.csv")) {
            if (inputStream != null) {
                Scanner scanner = new Scanner(inputStream);
                StringBuilder content = new StringBuilder();

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    content.append(line).append('\n');
                }

                return content.toString();
            } else {
                throw new FileNotFoundException("locations.csv not found in the classpath");
            }
        }
    }

    public static List<Location> getLocationValues(int size) {
        List<Location> tmplist = new LinkedList<>();

        try {
            String data = getRawFileData();

            while (data.contains("\n") && size > 0) {
                String line = data.substring(0, data.indexOf('\n'));
                data = data.substring(data.indexOf('\n') + 1);
                String[] tmp = line.split(",");

                if (tmp.length == 6 && tmp[0] != null && tmp[1] != null && tmp[2] != null && tmp[3] != null && tmp[4] != null && tmp[5] != null) {
                    Location tmpdict = new Location(Integer.parseInt(tmp[0]), tmp[1], tmp[2], tmp[3], Double.parseDouble(tmp[4]), Double.parseDouble(tmp[5]));
                    tmplist.add(tmpdict);
                    size--;
                } else {
                    logger.warn("Ommit record from the file : {}", line);
                }
            }

            return tmplist;
        } catch (IOException e) {
            logger.error("Error reading locations.csv file", e);
        }

        return tmplist;
    }

}
