package com.kardibus.moex.domain.objectXML.history;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataXML {

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "metadata")
    private MetaDataXML metaDataXML;

    @XmlElement(name = "rows")
    private RowsXML rowsXML;
}
