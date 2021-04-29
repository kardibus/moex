package com.kardibus.moex.domain.objectXML.history;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name = "data1")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataCursor {

    @XmlElement(name = "metadata")
    private MetadataCursor metadataCursore;

    @XmlElement(name = "rows")
    private RowsCursor rowsCursor;
}
