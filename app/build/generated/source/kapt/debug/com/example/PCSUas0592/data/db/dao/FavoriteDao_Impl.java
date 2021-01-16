package com.example.PCSUas0592.data.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.PCSUas0592.data.db.entities.EventFavorite;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfEventFavorite;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public FavoriteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEventFavorite = new EntityInsertionAdapter<EventFavorite>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `favorite`(`eventId`,`eventDate`,`eventTime`,`idHome`,`teamHome`,`scoreHome`,`formationHome`,`goalHome`,`shotHome`,`gkHome`,`defHome`,`midHome`,`forwHome`,`idAway`,`teamAway`,`scoreAway`,`formationAway`,`goalAway`,`shotAway`,`gkAway`,`defAway`,`midAway`,`forwAway`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EventFavorite value) {
        if (value.getEventId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getEventId());
        }
        if (value.getEventDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEventDate());
        }
        if (value.getEventTime() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEventTime());
        }
        if (value.getIdHome() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIdHome());
        }
        if (value.getTeamHome() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTeamHome());
        }
        if (value.getScoreHome() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getScoreHome());
        }
        if (value.getFormationHome() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getFormationHome());
        }
        if (value.getGoalHome() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getGoalHome());
        }
        if (value.getShotHome() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getShotHome());
        }
        if (value.getGkHome() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGkHome());
        }
        if (value.getDefHome() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDefHome());
        }
        if (value.getMidHome() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getMidHome());
        }
        if (value.getForwHome() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getForwHome());
        }
        if (value.getIdAway() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getIdAway());
        }
        if (value.getTeamAway() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getTeamAway());
        }
        if (value.getScoreAway() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getScoreAway());
        }
        if (value.getFormationAway() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getFormationAway());
        }
        if (value.getGoalAway() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getGoalAway());
        }
        if (value.getShotAway() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getShotAway());
        }
        if (value.getGkAway() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getGkAway());
        }
        if (value.getDefAway() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getDefAway());
        }
        if (value.getMidAway() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getMidAway());
        }
        if (value.getForwAway() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getForwAway());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favorite";
        return _query;
      }
    };
  }

  @Override
  public void insert(final EventFavorite eventFavorite) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEventFavorite.insert(eventFavorite);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<EventFavorite> getAll() {
    final String _sql = "SELECT * FROM favorite";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfEventId = CursorUtil.getColumnIndexOrThrow(_cursor, "eventId");
      final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
      final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
      final int _cursorIndexOfIdHome = CursorUtil.getColumnIndexOrThrow(_cursor, "idHome");
      final int _cursorIndexOfTeamHome = CursorUtil.getColumnIndexOrThrow(_cursor, "teamHome");
      final int _cursorIndexOfScoreHome = CursorUtil.getColumnIndexOrThrow(_cursor, "scoreHome");
      final int _cursorIndexOfFormationHome = CursorUtil.getColumnIndexOrThrow(_cursor, "formationHome");
      final int _cursorIndexOfGoalHome = CursorUtil.getColumnIndexOrThrow(_cursor, "goalHome");
      final int _cursorIndexOfShotHome = CursorUtil.getColumnIndexOrThrow(_cursor, "shotHome");
      final int _cursorIndexOfGkHome = CursorUtil.getColumnIndexOrThrow(_cursor, "gkHome");
      final int _cursorIndexOfDefHome = CursorUtil.getColumnIndexOrThrow(_cursor, "defHome");
      final int _cursorIndexOfMidHome = CursorUtil.getColumnIndexOrThrow(_cursor, "midHome");
      final int _cursorIndexOfForwHome = CursorUtil.getColumnIndexOrThrow(_cursor, "forwHome");
      final int _cursorIndexOfIdAway = CursorUtil.getColumnIndexOrThrow(_cursor, "idAway");
      final int _cursorIndexOfTeamAway = CursorUtil.getColumnIndexOrThrow(_cursor, "teamAway");
      final int _cursorIndexOfScoreAway = CursorUtil.getColumnIndexOrThrow(_cursor, "scoreAway");
      final int _cursorIndexOfFormationAway = CursorUtil.getColumnIndexOrThrow(_cursor, "formationAway");
      final int _cursorIndexOfGoalAway = CursorUtil.getColumnIndexOrThrow(_cursor, "goalAway");
      final int _cursorIndexOfShotAway = CursorUtil.getColumnIndexOrThrow(_cursor, "shotAway");
      final int _cursorIndexOfGkAway = CursorUtil.getColumnIndexOrThrow(_cursor, "gkAway");
      final int _cursorIndexOfDefAway = CursorUtil.getColumnIndexOrThrow(_cursor, "defAway");
      final int _cursorIndexOfMidAway = CursorUtil.getColumnIndexOrThrow(_cursor, "midAway");
      final int _cursorIndexOfForwAway = CursorUtil.getColumnIndexOrThrow(_cursor, "forwAway");
      final List<EventFavorite> _result = new ArrayList<EventFavorite>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EventFavorite _item;
        final Integer _tmpEventId;
        if (_cursor.isNull(_cursorIndexOfEventId)) {
          _tmpEventId = null;
        } else {
          _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
        }
        final String _tmpEventDate;
        _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
        final String _tmpEventTime;
        _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
        final String _tmpIdHome;
        _tmpIdHome = _cursor.getString(_cursorIndexOfIdHome);
        final String _tmpTeamHome;
        _tmpTeamHome = _cursor.getString(_cursorIndexOfTeamHome);
        final String _tmpScoreHome;
        _tmpScoreHome = _cursor.getString(_cursorIndexOfScoreHome);
        final String _tmpFormationHome;
        _tmpFormationHome = _cursor.getString(_cursorIndexOfFormationHome);
        final String _tmpGoalHome;
        _tmpGoalHome = _cursor.getString(_cursorIndexOfGoalHome);
        final String _tmpShotHome;
        _tmpShotHome = _cursor.getString(_cursorIndexOfShotHome);
        final String _tmpGkHome;
        _tmpGkHome = _cursor.getString(_cursorIndexOfGkHome);
        final String _tmpDefHome;
        _tmpDefHome = _cursor.getString(_cursorIndexOfDefHome);
        final String _tmpMidHome;
        _tmpMidHome = _cursor.getString(_cursorIndexOfMidHome);
        final String _tmpForwHome;
        _tmpForwHome = _cursor.getString(_cursorIndexOfForwHome);
        final String _tmpIdAway;
        _tmpIdAway = _cursor.getString(_cursorIndexOfIdAway);
        final String _tmpTeamAway;
        _tmpTeamAway = _cursor.getString(_cursorIndexOfTeamAway);
        final String _tmpScoreAway;
        _tmpScoreAway = _cursor.getString(_cursorIndexOfScoreAway);
        final String _tmpFormationAway;
        _tmpFormationAway = _cursor.getString(_cursorIndexOfFormationAway);
        final String _tmpGoalAway;
        _tmpGoalAway = _cursor.getString(_cursorIndexOfGoalAway);
        final String _tmpShotAway;
        _tmpShotAway = _cursor.getString(_cursorIndexOfShotAway);
        final String _tmpGkAway;
        _tmpGkAway = _cursor.getString(_cursorIndexOfGkAway);
        final String _tmpDefAway;
        _tmpDefAway = _cursor.getString(_cursorIndexOfDefAway);
        final String _tmpMidAway;
        _tmpMidAway = _cursor.getString(_cursorIndexOfMidAway);
        final String _tmpForwAway;
        _tmpForwAway = _cursor.getString(_cursorIndexOfForwAway);
        _item = new EventFavorite(_tmpEventId,_tmpEventDate,_tmpEventTime,_tmpIdHome,_tmpTeamHome,_tmpScoreHome,_tmpFormationHome,_tmpGoalHome,_tmpShotHome,_tmpGkHome,_tmpDefHome,_tmpMidHome,_tmpForwHome,_tmpIdAway,_tmpTeamAway,_tmpScoreAway,_tmpFormationAway,_tmpGoalAway,_tmpShotAway,_tmpGkAway,_tmpDefAway,_tmpMidAway,_tmpForwAway);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<EventFavorite> getByid(final int id) {
    final String _sql = "SELECT * FROM favorite WHERE eventId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfEventId = CursorUtil.getColumnIndexOrThrow(_cursor, "eventId");
      final int _cursorIndexOfEventDate = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDate");
      final int _cursorIndexOfEventTime = CursorUtil.getColumnIndexOrThrow(_cursor, "eventTime");
      final int _cursorIndexOfIdHome = CursorUtil.getColumnIndexOrThrow(_cursor, "idHome");
      final int _cursorIndexOfTeamHome = CursorUtil.getColumnIndexOrThrow(_cursor, "teamHome");
      final int _cursorIndexOfScoreHome = CursorUtil.getColumnIndexOrThrow(_cursor, "scoreHome");
      final int _cursorIndexOfFormationHome = CursorUtil.getColumnIndexOrThrow(_cursor, "formationHome");
      final int _cursorIndexOfGoalHome = CursorUtil.getColumnIndexOrThrow(_cursor, "goalHome");
      final int _cursorIndexOfShotHome = CursorUtil.getColumnIndexOrThrow(_cursor, "shotHome");
      final int _cursorIndexOfGkHome = CursorUtil.getColumnIndexOrThrow(_cursor, "gkHome");
      final int _cursorIndexOfDefHome = CursorUtil.getColumnIndexOrThrow(_cursor, "defHome");
      final int _cursorIndexOfMidHome = CursorUtil.getColumnIndexOrThrow(_cursor, "midHome");
      final int _cursorIndexOfForwHome = CursorUtil.getColumnIndexOrThrow(_cursor, "forwHome");
      final int _cursorIndexOfIdAway = CursorUtil.getColumnIndexOrThrow(_cursor, "idAway");
      final int _cursorIndexOfTeamAway = CursorUtil.getColumnIndexOrThrow(_cursor, "teamAway");
      final int _cursorIndexOfScoreAway = CursorUtil.getColumnIndexOrThrow(_cursor, "scoreAway");
      final int _cursorIndexOfFormationAway = CursorUtil.getColumnIndexOrThrow(_cursor, "formationAway");
      final int _cursorIndexOfGoalAway = CursorUtil.getColumnIndexOrThrow(_cursor, "goalAway");
      final int _cursorIndexOfShotAway = CursorUtil.getColumnIndexOrThrow(_cursor, "shotAway");
      final int _cursorIndexOfGkAway = CursorUtil.getColumnIndexOrThrow(_cursor, "gkAway");
      final int _cursorIndexOfDefAway = CursorUtil.getColumnIndexOrThrow(_cursor, "defAway");
      final int _cursorIndexOfMidAway = CursorUtil.getColumnIndexOrThrow(_cursor, "midAway");
      final int _cursorIndexOfForwAway = CursorUtil.getColumnIndexOrThrow(_cursor, "forwAway");
      final List<EventFavorite> _result = new ArrayList<EventFavorite>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EventFavorite _item;
        final Integer _tmpEventId;
        if (_cursor.isNull(_cursorIndexOfEventId)) {
          _tmpEventId = null;
        } else {
          _tmpEventId = _cursor.getInt(_cursorIndexOfEventId);
        }
        final String _tmpEventDate;
        _tmpEventDate = _cursor.getString(_cursorIndexOfEventDate);
        final String _tmpEventTime;
        _tmpEventTime = _cursor.getString(_cursorIndexOfEventTime);
        final String _tmpIdHome;
        _tmpIdHome = _cursor.getString(_cursorIndexOfIdHome);
        final String _tmpTeamHome;
        _tmpTeamHome = _cursor.getString(_cursorIndexOfTeamHome);
        final String _tmpScoreHome;
        _tmpScoreHome = _cursor.getString(_cursorIndexOfScoreHome);
        final String _tmpFormationHome;
        _tmpFormationHome = _cursor.getString(_cursorIndexOfFormationHome);
        final String _tmpGoalHome;
        _tmpGoalHome = _cursor.getString(_cursorIndexOfGoalHome);
        final String _tmpShotHome;
        _tmpShotHome = _cursor.getString(_cursorIndexOfShotHome);
        final String _tmpGkHome;
        _tmpGkHome = _cursor.getString(_cursorIndexOfGkHome);
        final String _tmpDefHome;
        _tmpDefHome = _cursor.getString(_cursorIndexOfDefHome);
        final String _tmpMidHome;
        _tmpMidHome = _cursor.getString(_cursorIndexOfMidHome);
        final String _tmpForwHome;
        _tmpForwHome = _cursor.getString(_cursorIndexOfForwHome);
        final String _tmpIdAway;
        _tmpIdAway = _cursor.getString(_cursorIndexOfIdAway);
        final String _tmpTeamAway;
        _tmpTeamAway = _cursor.getString(_cursorIndexOfTeamAway);
        final String _tmpScoreAway;
        _tmpScoreAway = _cursor.getString(_cursorIndexOfScoreAway);
        final String _tmpFormationAway;
        _tmpFormationAway = _cursor.getString(_cursorIndexOfFormationAway);
        final String _tmpGoalAway;
        _tmpGoalAway = _cursor.getString(_cursorIndexOfGoalAway);
        final String _tmpShotAway;
        _tmpShotAway = _cursor.getString(_cursorIndexOfShotAway);
        final String _tmpGkAway;
        _tmpGkAway = _cursor.getString(_cursorIndexOfGkAway);
        final String _tmpDefAway;
        _tmpDefAway = _cursor.getString(_cursorIndexOfDefAway);
        final String _tmpMidAway;
        _tmpMidAway = _cursor.getString(_cursorIndexOfMidAway);
        final String _tmpForwAway;
        _tmpForwAway = _cursor.getString(_cursorIndexOfForwAway);
        _item = new EventFavorite(_tmpEventId,_tmpEventDate,_tmpEventTime,_tmpIdHome,_tmpTeamHome,_tmpScoreHome,_tmpFormationHome,_tmpGoalHome,_tmpShotHome,_tmpGkHome,_tmpDefHome,_tmpMidHome,_tmpForwHome,_tmpIdAway,_tmpTeamAway,_tmpScoreAway,_tmpFormationAway,_tmpGoalAway,_tmpShotAway,_tmpGkAway,_tmpDefAway,_tmpMidAway,_tmpForwAway);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
