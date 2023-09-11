#!/bin/bash
#requires protoc be installed and in your path. ex. export PATH=$PATH:~/.nuget/packages/google.protobuf.tools/3.20.1/tools/macosx_x64
#requires protoc-gen-web be installed - https://github.com/grpc/grpc-web/releases 
#For Go, install the go plugin: https://github.com/golang/protobuf
#For ts, install the ts plugin: https://github.com/improbable-eng/ts-protoc-gen
PROTO_PATH="${PROTO_PATH:-../../../../.nuget/packages/google.protobuf.tools/3.24.3/tools}"
CSHARP_PLUGIN="${CSHARP_PLUGIN:-../../../../.nuget/packages/grpc.tools/2.46.1/tools/macosx_x64/grpc_csharp_plugin}"
PROTOC_GEN_TS_PATH="${PROTOC_GEN_TS_PATH:-./node_modules/.bin/protoc-gen-ts}"
echo "paths:"
echo $PROTO_PATH
echo $CSHARP_PLUGIN
echo $PROTOC_GEN_TS_PATH

mkdir -p ../src/tools/out/csharp
mkdir -p ../src/tools/out/java
mkdir -p ../src/tools/out/go
mkdir -p ../src/tools/out/js
mkdir -p ../src/tools/out/ts

#you will need to adjust the relative path to the protoc and grpc tools.

protoc --csharp_out=../src/tools/out/csharp --java_out=../src/tools/out/java --ts_out=import_style=commonjs:../src/tools/out/js --ts_out=import_style=commonjs:../src/tools/out/ts --grpc-web_out=import_style=commonjs,mode=grpcwebtext:../src/tools/out/js  --proto_path=. --proto_path=$PROTO_PATH ./metadata.proto --plugin=protoc-gen-web --plugin=protoc-gen-ts=$PROTOC_GEN_TS_PATH


cp ../src/tools/out/csharp/* ../src/tools/CC-Metadata/Model
