package com.realestate.tiles;

import java.util.List;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparerSupport;
import org.hibernate.Session;

import com.realestate.dao.BaseHibernateDAO;
import com.realestate.pojo.Estate4Sort;

public class SellSortPreparer extends ViewPreparerSupport {

	@SuppressWarnings("unchecked")
	@Override
	public void execute(TilesRequestContext tilesContext,
			AttributeContext attributeContext) throws PreparerException {
		Session session = new BaseHibernateDAO().getSession();
		List<Estate4Sort> eslist = session
				.createQuery(
						"select new com.realestate.pojo.Estate4Sort(e.id,e.name) from Estate e order by (e.sold/e.total) desc")
				.list();
		for (int i = 6; i < eslist.size();) {
			eslist.remove(i);
		}

		tilesContext.getSessionScope().put("sellsortList", eslist);
		session.close();
	}

}
