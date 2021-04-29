package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("data1")
public class DataCursor {

    @XStreamAlias("metadata")
    private MetadataCursor metadataCursore;

    @XStreamAlias("rows")
    private RowsCursor rowsCursor;
}
