/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.mapping.Murmur3HashProperty
@JsonpDeserializable
public final class Murmur3HashProperty extends DocValuesPropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	public Murmur3HashProperty(Builder builder) {
		super(builder);

	}

	public Murmur3HashProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "murmur3";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "murmur3");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Murmur3HashProperty}.
	 */
	public static class Builder extends DocValuesPropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<Murmur3HashProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Murmur3HashProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Murmur3HashProperty build() {

			return new Murmur3HashProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Murmur3HashProperty}
	 */
	public static final JsonpDeserializer<Murmur3HashProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, Murmur3HashProperty::setupMurmur3HashPropertyDeserializer, Builder::build);

	protected static void setupMurmur3HashPropertyDeserializer(DelegatingDeserializer<Murmur3HashProperty.Builder> op) {
		DocValuesPropertyBase.setupDocValuesPropertyBaseDeserializer(op);

		op.ignore("type");
	}

}
