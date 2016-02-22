package org.twang.Model.Pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MovieGenre")
public class MovieGenre {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
	@Column(name = "uuid")
	private String uuid;
	@Column(name = "gener")
	private String gener;
	public MovieGenre()
	{}
	public MovieGenre(String uuid, String gener) {
		this.uuid = uuid;
		this.gener = gener;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	@Override
    public String toString(){
        return "id="+id+", uuid="+uuid+", gener="+gener;
    }
	

}
