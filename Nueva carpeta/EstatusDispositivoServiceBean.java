package com.unixsycsapi.zuno.core.bs.impl;




import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.unixsycsapi.zuno.core.api.EstatusDispositivoRemoteService;
import com.unixsycsapi.zuno.core.api.EstatusDispositivoService;
import com.unixsycsapi.zuno.core.bs.impl.transformador.EstatusDispositivoTransformador;
import com.unixsycsapi.zuno.core.dm.EstatusDispositivoDTO;
import com.unixsycsapi.zuno.core.dm.EstatusDispositivoOutDTO;
import com.unixsycsapi.zuno.core.ds.EstatusDispositivoDAO;
import com.unixsycsapi.zuno.core.entity.EstatusDispositivo;




/**
 * @author Jacqueline Colorado, 2019-02-13
 *
 */

@Stateless
public class EstatusDispositivoServiceBean implements EstatusDispositivoRemoteService, EstatusDispositivoService{
	
@EJB
private EstatusDispositivoDAO estatusdispositivoDAO;

EstatusDispositivoOutDTO dtosal=new EstatusDispositivoOutDTO();
EstatusDispositivo estat_dis=new EstatusDispositivo();
@Override
public EstatusDispositivoOutDTO guardar(List<EstatusDispositivoDTO> lol) {
	// TODO Auto-generated method stub
	List<EstatusDispositivo> entityList = EstatusDispositivoTransformador.transformarEstatusDispositivo(lol);
	for (EstatusDispositivo entitiii:entityList) {
	estatusdispositivoDAO.guardar(entitiii);
	
	}
	return null;
}




}
