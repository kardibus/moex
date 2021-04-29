package com.kardibus.moex.domain.objectXML.history;

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
public class MetadataCursor {

    @XmlElement(name = "columns")
    private ColumnsCursor columnsCursor;
}
