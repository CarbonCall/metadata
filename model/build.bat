PATH = PATH + ";..\..\protobuf-2.4.3\bin"
Set PROTO_PATH=";..\..\protobuf-24.3/include"

..\..\protobuf-24.3\bin\protoc --csharp_out=../src/tools/out/csharp --proto_path=. ./metadata.proto 