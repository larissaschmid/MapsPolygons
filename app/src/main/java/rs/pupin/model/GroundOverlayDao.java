package rs.pupin.model;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import rs.pupin.model.GroundOverlay;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GROUND_OVERLAY".
*/
public class GroundOverlayDao extends AbstractDao<GroundOverlay, Long> {

    public static final String TABLENAME = "GROUND_OVERLAY";

    /**
     * Properties of entity GroundOverlay.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Path = new Property(1, String.class, "path", false, "PATH");
        public final static Property Lat = new Property(2, Double.class, "lat", false, "LAT");
        public final static Property Longit = new Property(3, Double.class, "longit", false, "LONGIT");
        public final static Property Width = new Property(4, Float.class, "width", false, "WIDTH");
        public final static Property Height = new Property(5, Float.class, "height", false, "HEIGHT");
        public final static Property Rotation = new Property(6, Float.class, "rotation", false, "ROTATION");
        public final static Property Map_layer_id = new Property(7, Long.class, "map_layer_id", false, "MAP_LAYER_ID");
    };

    private DaoSession daoSession;


    public GroundOverlayDao(DaoConfig config) {
        super(config);
    }
    
    public GroundOverlayDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GROUND_OVERLAY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PATH\" TEXT," + // 1: path
                "\"LAT\" REAL," + // 2: lat
                "\"LONGIT\" REAL," + // 3: longit
                "\"WIDTH\" REAL," + // 4: width
                "\"HEIGHT\" REAL," + // 5: height
                "\"ROTATION\" REAL," + // 6: rotation
                "\"MAP_LAYER_ID\" INTEGER);"); // 7: map_layer_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GROUND_OVERLAY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GroundOverlay entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(2, path);
        }
 
        Double lat = entity.getLat();
        if (lat != null) {
            stmt.bindDouble(3, lat);
        }
 
        Double longit = entity.getLongit();
        if (longit != null) {
            stmt.bindDouble(4, longit);
        }
 
        Float width = entity.getWidth();
        if (width != null) {
            stmt.bindDouble(5, width);
        }
 
        Float height = entity.getHeight();
        if (height != null) {
            stmt.bindDouble(6, height);
        }
 
        Float rotation = entity.getRotation();
        if (rotation != null) {
            stmt.bindDouble(7, rotation);
        }
 
        Long map_layer_id = entity.getMap_layer_id();
        if (map_layer_id != null) {
            stmt.bindLong(8, map_layer_id);
        }
    }

    @Override
    protected void attachEntity(GroundOverlay entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GroundOverlay readEntity(Cursor cursor, int offset) {
        GroundOverlay entity = new GroundOverlay( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // path
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // lat
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // longit
            cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4), // width
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // height
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // rotation
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7) // map_layer_id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GroundOverlay entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLat(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setLongit(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setWidth(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
        entity.setHeight(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setRotation(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setMap_layer_id(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GroundOverlay entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GroundOverlay entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getLayerDao().getAllColumns());
            builder.append(" FROM GROUND_OVERLAY T");
            builder.append(" LEFT JOIN LAYER T0 ON T.\"MAP_LAYER_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected GroundOverlay loadCurrentDeep(Cursor cursor, boolean lock) {
        GroundOverlay entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Layer layer = loadCurrentOther(daoSession.getLayerDao(), cursor, offset);
        entity.setLayer(layer);

        return entity;    
    }

    public GroundOverlay loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<GroundOverlay> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<GroundOverlay> list = new ArrayList<GroundOverlay>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<GroundOverlay> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<GroundOverlay> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
