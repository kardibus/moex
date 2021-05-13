package com.kardibus.moex.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class SecuritiesEntity implements Serializable {

    @Id
    private Long id;

    @NaturalId
    private String secid;

    private String shortname;

    private String regnumber;

    private String name;

    private String isin;

    private String is_traded;

    private String emitent_id;

    private String emitent_title;

    private String emitent_inn;

    private String emitent_okpo;

    private String gosreg;

    private String type;

    private String group_;

    private String primary_boardid;

    private String marketprice_boardid;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "secid",fetch = FetchType.EAGER)
    private Set<HistoryEntity> SECID;
}
