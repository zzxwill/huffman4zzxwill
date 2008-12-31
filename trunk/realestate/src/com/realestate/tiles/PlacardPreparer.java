package com.realestate.tiles;

import java.util.List;

import org.apache.tiles.AttributeContext;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.PreparerException;
import org.apache.tiles.preparer.ViewPreparerSupport;
import org.hibernate.Transaction;

import com.realestate.dao.NoticeDAO;
import com.realestate.pojo.Notice4Index;

public class PlacardPreparer extends ViewPreparerSupport {

	@SuppressWarnings("unchecked")
	@Override
	public void execute(TilesRequestContext tilesContext,
			AttributeContext attributeContext) throws PreparerException {
		// TODO Auto-generated method stub

		NoticeDAO ndao = new NoticeDAO();
		Transaction tran = ndao.getSession().beginTransaction();
		List<Notice4Index> placardlist = ndao
				.getSession()
				.createQuery(
						"select new com.realestate.pojo.Notice4Index(n.id,n.title) from Notice n")
				.list();

		for (int i = 6; i < placardlist.size();) {
			placardlist.remove(i);
		}

		tilesContext.getSessionScope().put("placardlist", placardlist);
		ndao.getSession().close();
	}
}
