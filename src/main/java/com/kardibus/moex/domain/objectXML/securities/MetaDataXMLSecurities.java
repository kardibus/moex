package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("metadata")
public class MetaDataXMLSecurities {

    @XStreamAlias("columns")
    private ColumnsXMLSecurities columnsXMLSecurities;
}
