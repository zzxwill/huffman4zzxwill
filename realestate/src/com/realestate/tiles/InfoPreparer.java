package com.realestate.tiles;

import java.util.List;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparerSupport;
import org.hibernate.Session;

import com.realestate.dao.BaseHibernateDAO;
import com.realestate.pojo.Developer4Index;
import com.realestate.pojo.Estate4Index;

public class InfoPreparer extends ViewPreparerSupport {

	@Override
	public void execute(TilesRequestContext tilesContext,
			AttributeContext attributeContext) throws PreparerException {
		Session  session=new BaseHibernateDAO().getSession();
		List<Estate4Index> estList=session.createQuery("select new com.realestate.pojo.Estate4Index(e.id,e.name,e.image,e.typedetail,e.traffic,e.avgPrice,e.startPrice) from Estate e").list();
		for(int i=12;i<estList.size();){
				estList.remove(i);
		}
		tilesContext.getRequestScope().put("estList", estList);
		List<Developer4Index> devLsit=session.createQuery("select new com.realestate.pojo.Developer4Index(d.id,d.companyName,d.address,d.telephone) from Developer d").list();
		for(int j=7;j<devLsit.size();){
				devLsit.remove(j);
		}
		tilesContext.getRequestScope().put("devList", devLsit);
		session.close();
	}



}
