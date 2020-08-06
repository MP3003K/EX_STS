package pe.edu.upeu.hotel.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.hotel.dao.HotelDao;
import pe.edu.upeu.hotel.entity.Cliente;
import pe.edu.upeu.hotel.service.HotelService;
@Service
public class HotelServiceImp implements HotelService {
	@Autowired
	private HotelDao hotelDao;
	@Override
	public List<Cliente> readAll() {
		return hotelDao.readAll();
	}

	@Override
	public int create(Cliente cli) {
		return 0;
	}

	@Override
	public int edit(Cliente cli) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public Cliente read(int id) {
		return null;
	}

}
