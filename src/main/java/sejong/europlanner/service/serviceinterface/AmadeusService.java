package sejong.europlanner.service.serviceinterface;

import sejong.europlanner.dto.FlightOfferDto;
import sejong.europlanner.dto.HotelInfoDto;

import java.util.List;

public interface AmadeusService {
    String getAccessToken();

    List<HotelInfoDto> getHotelList(String cityCode);

    String getHotelInfo(List<String> hotelIds);

    List<FlightOfferDto> getFlightOffers(String originLocationCode,
                                         String destinationLocationCode,
                                         String departureDate,
                                         String adults);
}
