package com.sivalabs.jblogger.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Siva
 *
 */
@Entity
@Table(name="roles")
@Data
public class Role implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false, unique=true)
	@NotEmpty
	private String name;
	
	@Column(length=1024)
	private String description;
		
	@ManyToMany(mappedBy="roles")
	private List<User> users;

}
