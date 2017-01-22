package com.sksamuel.elastic4s

import com.sksamuel.elastic4s.alias.AliasesApi
import com.sksamuel.elastic4s.bulk.BulkApi
import com.sksamuel.elastic4s.delete.DeleteApi
import com.sksamuel.elastic4s.explain.ExplainApi
import com.sksamuel.elastic4s.get.GetApi
import com.sksamuel.elastic4s.indexes.IndexApi
import com.sksamuel.elastic4s.mappings.DynamicTemplateApi
import com.sksamuel.elastic4s.reindex.ReindexApi
import com.sksamuel.elastic4s.script.ScriptApi
import com.sksamuel.elastic4s.searches.HighlightApi
import com.sksamuel.elastic4s.task.TaskApi
import com.sksamuel.elastic4s.termvectors.TermVectorApi
import com.sksamuel.elastic4s.update.UpdateApi
import com.sksamuel.elastic4s.validate.ValidateApi

// contains all the syntactic definitions
trait ElasticApi
  extends AliasesApi
    with BulkApi
    with DeleteApi
    with DynamicTemplateApi
    with ExplainApi
    with GetApi
    with HighlightApi
    with IndexApi
    with ReindexApi
    with ScriptApi
    with TaskApi
    with TermVectorApi
    with TypesApi
    with UpdateApi
    with ValidateApi