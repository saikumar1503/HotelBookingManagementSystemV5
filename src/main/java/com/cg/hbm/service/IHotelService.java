package com.cg.hbm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hbm.dto.HotelResponseDTO;
import com.cg.hbm.dto.HotelRequestDTO;

@Service
public interface IHotelService {
	HotelResponseDTO createHotel(HotelRequestDTO hotelDto); //Pratik
	HotelResponseDTO updateHotel(HotelRequestDTO hotelDto,int hotelId); //Pratik
	void deleteHotel(int hotelId); //Pratik
	HotelResponseDTO getHotelById(int hotelId); //Neela
	List<HotelResponseDTO> getAllHotels(); //Pratik
	List<HotelResponseDTO> searchHotelsByCity(String city); 
	List<HotelResponseDTO> getHotelsByAverageRate(double minRate, double maxRate); //Mahesh
	
	List<HotelResponseDTO> getAllBookedHotels(); //Neela
	List<HotelResponseDTO> getAllNonBookedHotels(); 
	List<HotelResponseDTO> getAllBookedHotelsByCity(String city);
	
}
