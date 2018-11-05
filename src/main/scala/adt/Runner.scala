package adt

import scodec.bits._

object Runner extends App {
  val hexValue = hex"0b0000000d4d617020627920526f54476152000000000000000000000000000000000000000000000000001176697263696f70797263696f312e706e67000000000000002f2f32ff202020ffbe000000050500007d0d0600160000000000b0c3000020430000803f0000803fa3a3a5ff898808bf0e745a3d000018c4000000420000803f0000803f000000ff8fc275bf0ad723be0000b0c3000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be2ef9e43e2ef964bf0000000003ae073f6b16593f00000000000080bf0000000000000000000000b0c3000020430000803f0000803fa3a3a5ff898808bf0e745a3d00000000000020430000803f0000803f606060ff0e745a3d0e745a3d000000000000c0430000803f0000803f000000ff0e745a3d0e74da3e000000000000803f00000000000080bf0000000000000000ac70093f33fa57bf0000000000000000000000c0430000803f0000803f000000ff0e745a3d0e74da3e0000b0c30000c0430000803f0000803f000000ff898808bf0e74da3e0000b0c3000020430000803f0000803fa3a3a5ff898808bf0e745a3d00000000000080bf000000000000803f0000000000000000ac7009bf33fa573f00000000000000b0c30000c0430000803f0000803f000000ff898808bf0e74da3e000008c40000a0430000803f0000803f000000ff0e745abf0ad7a33e0000b0c3000020430000803f0000803fa3a3a5ff898808bf0e745a3d9be8a13ee8dc72bf0000000020e3233f26aa443f00000000000080bf000000000000000000000008c40000a0430000803f0000803f000000ff0e745abf0ad7a33e000018c4000000420000803f0000803f000000ff8fc275bf0ad723be0000b0c3000020430000803f0000803fa3a3a5ff898808bf0e745a3d65e7793f05235ebe000000002ef9e4be2ef9643f0000000020e323bf26aa44bf00000000000000b0c3000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be000000000000c0c30000803f0000803f000000ff0e745a3d0e745abf00000000000020c30000803f0000803f606060ff0e745a3d8fc2f5be6b92163f54094f3f00000000000080bf0000000000000000cf6ab9bddcf27ebf0000000000000000000000c0c30000803f0000803f000000ff0e745a3d0e745abf0000b0c3000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be0000b0c30000a0c30000803f0000803f000000ff898808bf8c253fbf6b9216bf54094fbf000000000000803f0000000000000000bf2d373ee6de7b3f0000000000000018c4000000420000803f0000803f000000ff8fc275bf0ad723be000008c4000060c30000803f0000803f000000ff0e745abfc92f16bf0000b0c3000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be435b783f435b783e000000002ef9e4be2ef9643f0000000003ae07bf6b1659bf00000000000000b0c30000a0c30000803f0000803f000000ff898808bf8c253fbf0000b0c3000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be000008c4000060c30000803f0000803f000000ff0e745abfc92f16bf000080bf00000000000000002ef9e43e2ef964bf000000002ef9e43e2ef9643f00000000000000c0c2000020430000803f0000803f606060ff0e74dabd0e745a3d00000000000000430000803f0000803f606060ff0e745a3d0000000000000000000020430000803f0000803f606060ff0e745a3d0e745a3d9be8a13ee8dc723f00000000000080bf000000000000000000000000000080bf00000000000000b043000020430000803f0000803fa3a3a5ff898808bf0e745a3d0000b043000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be00001844000000420000803f0000803f000000ff8fc275bf0ad723be0000803f000000000000000003ae07bf6b16593f000000002ef9e4be2ef964bf00000000000000b043000020430000803f0000803fa3a3a5ff898808bf0e745a3d000000000000c0430000803f0000803f000000ff0e745a3d0e74da3e00000000000020430000803f0000803f606060ff0e745a3d0e745a3dac7009bf33fa57bf000000000000803f0000000000000000000000000000803f0000000000000000000000c0430000803f0000803f000000ff0e745a3d0e74da3e0000b043000020430000803f0000803fa3a3a5ff898808bf0e745a3d0000b0430000c0430000803f0000803f000000ff898808bf0e74da3eac70093f33fa573f00000000000080bf000000000000000000000000000080bf00000000000000b0430000c0430000803f0000803f000000ff898808bf0e74da3e0000b043000020430000803f0000803fa3a3a5ff898808bf0e745a3d000008440000a0430000803f0000803f000000ff0e745abf0ad7a33e0000803f000000000000000020e323bf26aa443f000000009be8a1bee8dc72bf0000000000000008440000a0430000803f0000803f000000ff0e745abf0ad7a33e0000b043000020430000803f0000803fa3a3a5ff898808bf0e745a3d00001844000000420000803f0000803f000000ff8fc275bf0ad723be20e3233f26aa44bf000000002ef9e43e2ef9643f0000000065e779bf05235ebe00000000000000b043000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be00000000000020c30000803f0000803f606060ff0e745a3d8fc2f5be000000000000c0c30000803f0000803f000000ff0e745a3d0e745abfcf6ab93ddcf27ebf000000000000803f00000000000000006b9216bf54094f3f0000000000000000000000c0c30000803f0000803f000000ff0e745a3d0e745abf0000b0430000a0c30000803f0000803f000000ff898808bf8c253fbf0000b043000000c30000803f0000803fa3a3a5ff935f0cbf97fce2bebf2d37bee6de7b3f00000000000080bf00000000000000006b92163f54094fbf000000000000001844000000420000803f0000803f000000ff8fc275bf0ad723be0000b043000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be00000844000060c30000803f0000803f000000ff0e745abfc92f16bf03ae073f6b1659bf000000002ef9e43e2ef9643f00000000435b78bf435b783e00000000000000b0430000a0c30000803f0000803f000000ff898808bf8c253fbf00000844000060c30000803f0000803f000000ff0e745abfc92f16bf0000b043000000c30000803f0000803fa3a3a5ff935f0cbf97fce2be2ef9e4be2ef9643f000000002ef9e4be2ef964bf000000000000803f0000000000000000000000c042000020430000803f0000803f606060ff0e74dabd0e745a3d00000000000020430000803f0000803f606060ff0e745a3d0e745a3d00000000000000430000803f0000803f606060ff0e745a3d0000000000000000000080bf000000000000803f00000000000000009be8a1bee8dc723f0000000000000000c1000020c30000803f0000803f606060ff0ad7233d8fc2f5be00000041000008430000803f0000803f606060ff8988883d0e745a3c000000c1000008430000803f0000803f606060ff0ad7233d0e745a3c77a07fbf28155d3d0000000000000000000080bf000000000000803f00000000000000000200000041000008430000803f0000803f606060ff8988883d0e745a3c000000c1000020c30000803f0000803f606060ff0ad7233d8fc2f5be00000041000020c30000803f0000803f606060ff8988883d8fc2f5be77a07f3f28155dbd00000000000000000000803f00000000000080bf0000000000000000021c000000190000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010008000300010005000800010005000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000800010008000100080001000800020001000800030001000500080002000100050001000500010005000100050001000500010005000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000800010008000100080001000800010008000000000000000200010008000000020001000500000000000000010005000100050001000500010005000100050001000500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010009000200080009000200080009000000000000000000000002000100080002000100080000000200010005000200010005000000000000000000000000000000020004000500010004000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000900020008000900020008000900000000000000000002000100080002000100080000000000000002000100050000000000000000000000000002000400050002000400050001000400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000900010009000000020008000900020008000900000000000000020001000800020001000800000000000000020001000500020001000500000000000000000002000400050002000400050000000100040000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100090001000900000002000800090002000800090000000000020001000800020001000800000000000000000000000200010005000000000000000200040005000200040005000000000001000400010004000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000900010009000000000000000200080009000200080009000000020001000800000000000000000000000000020001000500020001000500000002000400050002000400050000000000000000000100040000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010009000100090000000000000002000800090002000800090002000100080002000100080000000000000000000000000000000200010005000200040005000200040005000000000000000000000001000400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000200070009000200070009000200070009000200070009000200070009000200070009000500010006000700080009000200010008000100010001000100010001000100010001000100010001000100010001000100020001000500050001000200030004000500030003000400050002000300040002000300040002000300040002000300040002000300040002000300040002000300040000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000700010007000000000000000000000002000600070000000000000000000000000000000000000000000200020003000000000000000000000000000000010003000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100070000000000000000000000020006000700020006000700000000000000000000000000000000000000000002000200030002000200030000000000000000000000000001000300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000000000000000000020006000700020006000700010006000000000000000000000000000000000000000000010002000200020003000200020003000000000000000000000001000300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000000000000000200060007000200060007000000010006000000000000000000000000000000000000000000010002000000020002000300000000000000000000000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000700000000000000020006000700020006000700000001000600000000000000000000000000000000000000000001000200000002000200030002000200030000000000000000000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000100070000000000020006000700020006000700000000000100060000000000000000000000000000000000000000000100020000000000020002000300020002000300000000000000010003000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001000700010007000000020006000700020006000700000000000000010006000000000000000000000000000000000000000000010002000000000000000200020003000000000000000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000000020006000700020006000700000000000000000001000600000000000000000000000000000000000000000001000200000000000000020002000300020002000300000000000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000000020006000700020006000700000000000000000001000600000000000000000000000000000000000000000001000200000000000000000002000200030002000200030000000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010007000200060007000200060007000000000000000000010006000100060000000000000000000000000000000000000001000a00020002000a0000000000000000000200020003000200020003000000010003000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002000600070002000600070000000000000000000000010006000100060000000000000000000000000000000000000001000a00020002000a00000000000000000000000200020003000200020003000100030000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100070002000600070000000000000000000000000001000600000000000000000000000000000000000000000001000a00020002000a0000000000000000000000000002000200030001000300000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004000600070010001100040006000700100011000200060010000200060010000200060010000200060010000200060010000200060010000400060010001500160002001500160002001500160002001500160002001500160002001500160002001500160002001500160002001500160002001500160002001500160004000a00140015001600040002000a000c001400020002000c00020002000c00020002000c00020002000c00020002000c00020002000c000400020003000c000d000400020003000c000d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010011000200100011000000000000000000000000000100100000000000000000000000000000000000000000000100140002000c00140000000000000000000000000002000c000d0001000d00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000200100011000200100011000000000000000000000001001000010010000000000000000000000000000000000000000100140002000c0014000000000000000000000002000c000d0002000c000d0001000d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001100020010001100020010001100000000000000000001001000010010000000000000000000000000000000000000000100140002000c001400000000000000000002000c000d0002000c000d00000001000d0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010011000000020010001100020010001100000000000000000001001000000000000000000000000000000000000000000001000c00000000000000000002000c000d0002000c000d00000001000d0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010011000000020010001100020010001100000000000000000001001000000000000000000000000000000000000000000001000c0000000000000002000c000d0002000c000d000000000001000d00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100110001001100000002001000110002001000110000000000000001001000000000000000000000000000000000000000000001000c0000000000000002000c000d0000000000000001000d00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100110001001100000000000200100011000200100011000000000001001000000000000000000000000000000000000000000001000c000000000002000c000d0002000c000d0000000000000001000d0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001100000000000000020010001100020010001100000001001000000000000000000000000000000000000000000001000c00000002000c000d0002000c000d00000000000000000001000d0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001100000000000000020010001100020010001100000001001000000000000000000000000000000000000000000001000c00000002000c000d000000000000000000000001000d0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001100000000000000000002001000110002001000110001001000000000000000000000000000000000000000000001000c0002000c000d0002000c000d000000000000000000000001000d000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100110000000000000000000000020010001100020010001100000000000000000000000000000000000000000002000c000d0002000c000d0000000000000000000000000001000d00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010011000100110000000000000000000000020010001100000000000000000000000000000000000000000002000c000d00000000000000000000000000000001000d00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002001100130002001100130002001100130002001100130002001100130002001100130005000b00100011001200130002000b00120001000b0001000b0001000b0001000b0001000b0001000b0001000b0001000b0002000b000f0005000b000c000d000e000f0003000d000e000f0002000d000e0002000d000e0002000d000e0002000d000e0002000d000e0002000d000e0002000d000e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010013000100130000000000000002001200130002001200130002000b00120002000b001200000000000000000000000000000002000b000f0002000e000f0002000e000f000000000000000000000001000e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100130001001300000000000000020012001300020012001300000002000b00120000000000000000000000000002000b000f0002000b000f00000002000e000f0002000e000f00000000000000000001000e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010013000100130000000200120013000200120013000000000002000b00120002000b0012000000000000000000000002000b000f0000000000000002000e000f0002000e000f000000000001000e0001000e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100130001001300000002001200130002001200130000000000000002000b00120002000b00120000000000000002000b000f0002000b000f00000000000000000002000e000f0002000e000f00000001000e000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001001300020012001300020012001300000000000000000002000b00120002000b00120000000000000002000b000f0000000000000000000000000002000e000f0002000e000f0001000e0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010013000200120013000200120013000000000000000000000002000b00120002000b001200000002000b000f0002000b000f00000000000000000000000000000002000e000f0001000e00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010012000100120001001200010012000100120000000000000002000b001200000002000b000f0000000000000001000f0001000f0001000f0001000f0001000f0001000f00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100120001001200010012000100120002000b00120003000b000f00120002000b000f0001000f0001000f0001000f0001000f0001000f0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000100120003000b000f00120001000f000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000013000000ffff0700440000004e0000000000d8c300001843000000000000803f0000803fff000000ffffffff02000000ffff0700440000004e0000000000c8c3000050c3000000000000803f0000803fff000000ffffffff02000000ffff0700440000004e000000000008c400000000000000000000803f0000803fff000000ffffffff02000000ffff09008300000082000000000000c4000008c3000000000000803f0000803fff000000ffffffff02000000ffff0b00800000000c0000000000b4c300001843000000000000803f0000803f66000000202020ff01000000ffff0b00800000000c000000000080c300001843000000000000803f0000803f66000000202020ff01000000ffff0b00800000000c000000000018c300001843000000000000803f0000803f66000000202020ff01000000ffff0c0012010000000100000000e8c30000d042000000000000803f0000803f66000000202020ff01000000ffff0c0012010000000100000000a0c30000e042000000000000803f0000803f66000000202020ff01000000ffff0700440000004e0000000000d8430000184300000080000080bf0000803fff000000ffffffff02000000ffff0700440000004e0000000000c843000050c300000080000080bf0000803fff000000ffffffff02000000ffff0700440000004e000000000008440000000000000080000080bf0000803fff000000ffffffff02000000ffff0900830000008200000000000044000008c300000080000080bf0000803fff000000ffffffff02000000ffff0b00800000000c0000000000b4430000184300000080000080bf0000803f66000000202020ff01000000ffff0b00800000000c000000000080430000184300000080000080bf0000803f66000000202020ff01000000ffff0b00800000000c000000000018430000184300000080000080bf0000803f66000000202020ff01000000ffff0c0012010000000100000000e8430000d04200000080000080bf0000803f66000000202020ff01000000ffff0c0012010000000100000000a0430000e04200000080000080bf0000803f66000000202020ff01000000ffff0d00fe01000004010000000080c300007043000000000000803f0000803fb2000000ffffffff020000000e000000126172656e61325f57455f62675f312e626d700000000000000000000000000000000000000000000000000000000000000000ca8c9841137269722d6c65697465722d6c6f6e672e626d700000000000000000000000000000000000000000000000000000000000000054639941177269722d6c756674736368616368742d6269672e626d70000000000000000000000000000000000000000000000000000000e85e26420d7269722d726f6872622e626d7068742d6269672e626d70000000000000000000000000000000000000000000000000000000e85e26420c7269722d726f68722e626d707068742d6269672e626d70000000000000000000000000000000000000000000000000000000e85e264209726f6f74732e626d70626d707068742d6269672e626d7000000000000000000000000000000000000000000000000000000065bb683e0e7273665f637261636b322e706e67742d6269672e626d70000000000000000000000000000000000000000000000000000000876299410e73665f6c616e637563682e706e67742d6269672e626d700000000000000000000000000000000000000000000000000000009b6299410d53535f426f647930312e504e4767742d6269672e626d70000000000000000000000000000000000000000000000000000000546399410d73742d636861696e322e626d7067742d6269672e626d70000000000000000000000000000000000000000000000000000000856898411073742d6372616e657261696c2e626d706269672e626d700000000000000000000000000000000000000000000000000000009b6299410f7665675f646561645f31372e706e67706269672e626d70000000000000000000000000000000000000000000000000000000aa6299410d6579655f736174616e2e626d706e67706269672e626d70000000000000000000000000000000000000000000000000000000e57d244211436f7079206f662077616c6c312e706e6769672e626d70000000000000000000000000000000000000000000000000000000e47d2442000000000600000001000000c0feffff80000000010000000100000020ffffff80000000010000000100000080ffffff80000000010000000100000080000000800000000200000001000000e000000080000000020000000100000040010000800000000200000000000000000000000000000002000000000000000000000000000000"
  val result = PmsFile.codec.decodeValue(hexValue.bits)
  println(result)
}
