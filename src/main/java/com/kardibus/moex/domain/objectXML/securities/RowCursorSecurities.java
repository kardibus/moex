package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("row")
public class RowCursorSecurities {

    @XStreamAlias("INDEX")
    @XStreamAsAttribute
    private String INDEX;

    @XStreamAlias("TOTAL")
    @XStreamAsAttribute
    private String TOTAL;

    @XStreamAlias("PAGESIZE")
    @XStreamAsAttribute
    private String PAGESIZE;
}
