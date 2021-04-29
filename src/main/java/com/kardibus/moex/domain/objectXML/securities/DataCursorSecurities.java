package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("data1")
public class DataCursorSecurities {

    @XStreamAlias("metadata")
    private MetadataCursorSecurities metadataCursoreSecurities;

    @XStreamAlias("rows")
    private RowsCursorSecurities rowsCursorSecurities;
}
