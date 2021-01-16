package com.example.PCSUas0592.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.PCSUas0592.data.db.dao.FavoriteDao;
import com.example.PCSUas0592.data.db.dao.FavoriteDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile FavoriteDao _favoriteDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite` (`eventId` INTEGER, `eventDate` TEXT, `eventTime` TEXT, `idHome` TEXT, `teamHome` TEXT, `scoreHome` TEXT, `formationHome` TEXT, `goalHome` TEXT, `shotHome` TEXT, `gkHome` TEXT, `defHome` TEXT, `midHome` TEXT, `forwHome` TEXT, `idAway` TEXT, `teamAway` TEXT, `scoreAway` TEXT, `formationAway` TEXT, `goalAway` TEXT, `shotAway` TEXT, `gkAway` TEXT, `defAway` TEXT, `midAway` TEXT, `forwAway` TEXT, PRIMARY KEY(`eventId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '985f546f6a9fb9b412414acfdd3e601d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `favorite`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavorite = new HashMap<String, TableInfo.Column>(23);
        _columnsFavorite.put("eventId", new TableInfo.Column("eventId", "INTEGER", false, 1));
        _columnsFavorite.put("eventDate", new TableInfo.Column("eventDate", "TEXT", false, 0));
        _columnsFavorite.put("eventTime", new TableInfo.Column("eventTime", "TEXT", false, 0));
        _columnsFavorite.put("idHome", new TableInfo.Column("idHome", "TEXT", false, 0));
        _columnsFavorite.put("teamHome", new TableInfo.Column("teamHome", "TEXT", false, 0));
        _columnsFavorite.put("scoreHome", new TableInfo.Column("scoreHome", "TEXT", false, 0));
        _columnsFavorite.put("formationHome", new TableInfo.Column("formationHome", "TEXT", false, 0));
        _columnsFavorite.put("goalHome", new TableInfo.Column("goalHome", "TEXT", false, 0));
        _columnsFavorite.put("shotHome", new TableInfo.Column("shotHome", "TEXT", false, 0));
        _columnsFavorite.put("gkHome", new TableInfo.Column("gkHome", "TEXT", false, 0));
        _columnsFavorite.put("defHome", new TableInfo.Column("defHome", "TEXT", false, 0));
        _columnsFavorite.put("midHome", new TableInfo.Column("midHome", "TEXT", false, 0));
        _columnsFavorite.put("forwHome", new TableInfo.Column("forwHome", "TEXT", false, 0));
        _columnsFavorite.put("idAway", new TableInfo.Column("idAway", "TEXT", false, 0));
        _columnsFavorite.put("teamAway", new TableInfo.Column("teamAway", "TEXT", false, 0));
        _columnsFavorite.put("scoreAway", new TableInfo.Column("scoreAway", "TEXT", false, 0));
        _columnsFavorite.put("formationAway", new TableInfo.Column("formationAway", "TEXT", false, 0));
        _columnsFavorite.put("goalAway", new TableInfo.Column("goalAway", "TEXT", false, 0));
        _columnsFavorite.put("shotAway", new TableInfo.Column("shotAway", "TEXT", false, 0));
        _columnsFavorite.put("gkAway", new TableInfo.Column("gkAway", "TEXT", false, 0));
        _columnsFavorite.put("defAway", new TableInfo.Column("defAway", "TEXT", false, 0));
        _columnsFavorite.put("midAway", new TableInfo.Column("midAway", "TEXT", false, 0));
        _columnsFavorite.put("forwAway", new TableInfo.Column("forwAway", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavorite = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavorite = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavorite = new TableInfo("favorite", _columnsFavorite, _foreignKeysFavorite, _indicesFavorite);
        final TableInfo _existingFavorite = TableInfo.read(_db, "favorite");
        if (! _infoFavorite.equals(_existingFavorite)) {
          throw new IllegalStateException("Migration didn't properly handle favorite(com.example.PCSUas0592.data.db.entities.EventFavorite).\n"
                  + " Expected:\n" + _infoFavorite + "\n"
                  + " Found:\n" + _existingFavorite);
        }
      }
    }, "985f546f6a9fb9b412414acfdd3e601d", "7f76b89c66ffbd5a6fdb79e1197cf649");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FavoriteDao getFavoriteDao() {
    if (_favoriteDao != null) {
      return _favoriteDao;
    } else {
      synchronized(this) {
        if(_favoriteDao == null) {
          _favoriteDao = new FavoriteDao_Impl(this);
        }
        return _favoriteDao;
      }
    }
  }
}
