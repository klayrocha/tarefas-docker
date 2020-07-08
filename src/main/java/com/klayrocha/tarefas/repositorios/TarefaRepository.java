package com.klayrocha.tarefas.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.klayrocha.tarefas.entidades.Tarefa;

@RepositoryRestResource(collectionResourceRel = "tarefas", path = "tarefas")
public interface TarefaRepository extends PagingAndSortingRepository<Tarefa, Long>{

}
