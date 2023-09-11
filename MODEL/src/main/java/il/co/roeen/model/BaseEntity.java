package il.co.roeen.model;

import java.io.Serializable;

public class BaseEntity implements Serializable
{
    protected String idFs;



    public BaseEntity(String idFs)
    {
        this.idFs = idFs;
    }
    public void setIdFs(String idFs)
    {
        this.idFs = idFs;
    }
    public String getIdFs()
    {
        return this.idFs;
    }
}

