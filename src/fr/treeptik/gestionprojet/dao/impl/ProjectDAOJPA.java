package fr.treeptik.gestionprojet.dao.impl;

import fr.treeptik.gestionprojet.dao.ProjectDAO;
import fr.treeptik.gestionprojet.model.Project;

public class ProjectDAOJPA extends GenericDAOJPA<Project, Integer> implements ProjectDAO{

	public ProjectDAOJPA() {
		super(Project.class);
	}

}
