package com.database.dao.repository;

import com.database.dao.hibernateDAO.AbstractHibernateDAO;
import com.database.dao.hibernateDAO.IFooDAO;
import com.database.dao.model.Foo;

import org.springframework.stereotype.Repository;

@Repository
public class FooRepository extends AbstractHibernateDAO<Foo> implements IFooDAO{

	@Override
	public void FooDao() {
		setClazz(Foo.class);
	}
}
