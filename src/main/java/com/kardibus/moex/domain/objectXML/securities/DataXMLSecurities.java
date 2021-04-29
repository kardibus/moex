package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataXMLSecurities {

    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "metadata")
    private MetaDataXMLSecurities metaDataXMLSecurities;

    @XmlElement(name = "rows")
    private RowsXMLSecurities rowsXMLSecurities;
}
