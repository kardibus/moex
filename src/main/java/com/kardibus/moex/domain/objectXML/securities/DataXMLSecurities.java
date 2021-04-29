package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("data")
public class DataXMLSecurities {

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;

    @XStreamAlias("metadata")
    @XStreamAsAttribute
    private MetaDataXMLSecurities metaDataXMLSecurities;

    @XStreamAlias("rows")
    private RowsXMLSecurities rowsXMLSecurities;
}
