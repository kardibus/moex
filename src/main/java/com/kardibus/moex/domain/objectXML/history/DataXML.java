package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("data")
public class DataXML {

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;

    @XStreamAlias("metadata")
    @XStreamAsAttribute
    private MetaDataXML metaDataXML;

    @XStreamAlias("rows")
    private RowsXML rowsXML;
}
