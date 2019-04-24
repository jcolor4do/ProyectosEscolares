package com.unixsycsapi.zuno.core.bs.impl.transformador;

import java.util.ArrayList;
import java.util.List;

import com.unixsycsapi.zuno.core.dm.EstatusDispositivoDTO;
import com.unixsycsapi.zuno.core.entity.EstatusDispositivo;

public class EstatusDispositivoTransformador {
	
	public static List<EstatusDispositivo> transformarEstatusDispositivo(List<EstatusDispositivoDTO> listaEstatusDTO) {
		List<EstatusDispositivo> estatusDispositivoList = new ArrayList<EstatusDispositivo>();
		for (EstatusDispositivoDTO estatus:listaEstatusDTO) {
			EstatusDispositivo estatusDispositivo = new EstatusDispositivo();
			estatusDispositivo.setClasificacion(estatus.getClasificacion());
			estatusDispositivo.setCodigo(estatus.getCodigo());
			estatusDispositivo.setFecha(estatus.getFecha());
			estatusDispositivo.setId_dispositivo(estatus.getId_dispositivo());
			estatusDispositivo.setMensaje(estatus.getMensaje());
			
			estatusDispositivoList.add(estatusDispositivo);
		}
		
		return estatusDispositivoList;
	}

}
