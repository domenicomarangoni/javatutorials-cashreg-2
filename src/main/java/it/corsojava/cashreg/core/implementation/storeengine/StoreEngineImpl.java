package it.corsojava.cashreg.core.implementation.storeengine;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import it.corsojava.cashreg.core.Scontrino;
import it.corsojava.cashreg.core.implementation.StoreEngine;
import it.corsojava.cashreg.core.implementation.exceptions.StoreEngineLoadException;
import it.corsojava.cashreg.core.implementation.exceptions.StoreEngineSaveScontrinoException;

public class StoreEngineImpl implements StoreEngine {

	SessionFactory factory =null;
	
	public StoreEngineImpl() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactoryBuilder sfBuilder=meta.getSessionFactoryBuilder(); 
		factory = sfBuilder.build();
	}
	
	@Override
	public Scontrino saveScontrino(Scontrino s) throws StoreEngineSaveScontrinoException {
		if(s==null) 
			throw new StoreEngineSaveScontrinoException("Nessuno scontrino da salvare");
		final Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(s);	
		t.commit();
		session.close();
		return s;
	}

	@Override
	public List<Scontrino> loadAll() throws StoreEngineLoadException {
		final Session session = factory.openSession();
		return session.createQuery("from ScontrinoImpl").list();

	}

}
