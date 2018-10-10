package com.example.codeclan.fileservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "files")
public class File implements Serializable {

    @Column(name = "name")
    private String name;

    @Column(name = "txt")
    private String txt;


    @Column(name = "size")
    private int size;

    @Column(name = "folder")
    private String folder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    @JsonIgnore
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "folder_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id", nullable = false, updatable = false)}
    )

   public File(String name, String txt, int size, String folder){
        this.name = name;
        this.txt = txt;
        this.size = size;
        this.folder = folder;
    }

    public File(){

    }

    public String getName() {
        return name;
    }

    public String getTxt() {
        return txt;
    }

    public int getSize() {
        return size;
    }

    public String getFolder() {
        return folder;
    }

    public Long getId() {
        return id;
    }


}
