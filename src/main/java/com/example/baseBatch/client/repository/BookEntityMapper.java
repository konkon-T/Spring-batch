package com.example.baseBatch.client.repository;

import static com.example.baseBatch.client.repository.BookEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.baseBatch.client.entity.BookEntity;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonSelectMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface BookEntityMapper extends CommonSelectMapper, CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.436158632+09:00", comments="Source Table: book")
    BasicColumn[] selectList = BasicColumn.columnList(bookId, author, description, imageUrl, publishDate, publisher, status, title);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.427295777+09:00", comments="Source Table: book")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT uuid()", keyProperty="row.bookId", before=true, resultType=String.class)
    int insert(InsertStatementProvider<BookEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.43094942+09:00", comments="Source Table: book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BookEntityResult", value = {
        @Result(column="book_id", property="bookId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_date", property="publishDate", jdbcType=JdbcType.DATE),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR)
    })
    List<BookEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.43190334+09:00", comments="Source Table: book")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BookEntityResult")
    Optional<BookEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.432474103+09:00", comments="Source Table: book")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.432890146+09:00", comments="Source Table: book")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.433299888+09:00", comments="Source Table: book")
    default int deleteByPrimaryKey(String bookId_) {
        return delete(c -> 
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.433751223+09:00", comments="Source Table: book")
    default int insert(BookEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookEntity, c ->
            c.map(bookId).toProperty("bookId")
            .map(author).toProperty("author")
            .map(description).toProperty("description")
            .map(imageUrl).toProperty("imageUrl")
            .map(publishDate).toProperty("publishDate")
            .map(publisher).toProperty("publisher")
            .map(status).toProperty("status")
            .map(title).toProperty("title")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.435073549+09:00", comments="Source Table: book")
    default int insertSelective(BookEntity row) {
        return MyBatis3Utils.insert(this::insert, row, bookEntity, c ->
            c.map(bookId).toProperty("bookId")
            .map(author).toPropertyWhenPresent("author", row::getAuthor)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(imageUrl).toPropertyWhenPresent("imageUrl", row::getImageUrl)
            .map(publishDate).toPropertyWhenPresent("publishDate", row::getPublishDate)
            .map(publisher).toPropertyWhenPresent("publisher", row::getPublisher)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.43729834+09:00", comments="Source Table: book")
    default Optional<BookEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.437807573+09:00", comments="Source Table: book")
    default List<BookEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.438280516+09:00", comments="Source Table: book")
    default List<BookEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.438728708+09:00", comments="Source Table: book")
    default Optional<BookEntity> selectByPrimaryKey(String bookId_) {
        return selectOne(c ->
            c.where(bookId, isEqualTo(bookId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.4391873+09:00", comments="Source Table: book")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bookEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.439629327+09:00", comments="Source Table: book")
    static UpdateDSL<UpdateModel> updateAllColumns(BookEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalTo(row::getBookId)
                .set(author).equalTo(row::getAuthor)
                .set(description).equalTo(row::getDescription)
                .set(imageUrl).equalTo(row::getImageUrl)
                .set(publishDate).equalTo(row::getPublishDate)
                .set(publisher).equalTo(row::getPublisher)
                .set(status).equalTo(row::getStatus)
                .set(title).equalTo(row::getTitle);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.44012498+09:00", comments="Source Table: book")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BookEntity row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bookId).equalToWhenPresent(row::getBookId)
                .set(author).equalToWhenPresent(row::getAuthor)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(imageUrl).equalToWhenPresent(row::getImageUrl)
                .set(publishDate).equalToWhenPresent(row::getPublishDate)
                .set(publisher).equalToWhenPresent(row::getPublisher)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(title).equalToWhenPresent(row::getTitle);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.440980377+09:00", comments="Source Table: book")
    default int updateByPrimaryKey(BookEntity row) {
        return update(c ->
            c.set(author).equalTo(row::getAuthor)
            .set(description).equalTo(row::getDescription)
            .set(imageUrl).equalTo(row::getImageUrl)
            .set(publishDate).equalTo(row::getPublishDate)
            .set(publisher).equalTo(row::getPublisher)
            .set(status).equalTo(row::getStatus)
            .set(title).equalTo(row::getTitle)
            .where(bookId, isEqualTo(row::getBookId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-10-23T22:09:22.441523565+09:00", comments="Source Table: book")
    default int updateByPrimaryKeySelective(BookEntity row) {
        return update(c ->
            c.set(author).equalToWhenPresent(row::getAuthor)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(imageUrl).equalToWhenPresent(row::getImageUrl)
            .set(publishDate).equalToWhenPresent(row::getPublishDate)
            .set(publisher).equalToWhenPresent(row::getPublisher)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(title).equalToWhenPresent(row::getTitle)
            .where(bookId, isEqualTo(row::getBookId))
        );
    }
}