package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name = "metadata")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetaDataXMLSecurities {

    @XmlElement(name = "columns")
    private ColumnsXMLSecurities columnsXMLSecurities;
}
