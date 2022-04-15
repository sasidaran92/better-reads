package com.sasidaran.book;

import org.springframework.stereotype.Repository;
import org.springframework.data.cassandra.repository.CassandraRepository;

@Repository
public interface BookRepository extends CassandraRepository<Book, String> {

}
