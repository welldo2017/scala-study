package com.welldo.study.chapter12.cassclass6

/**
  * 一捆商品: 商品的描述, 减免多少钱, 这一捆中包含的item(一个或多个)
  *
  * author : welldo 
  * date : 2020/1/14 11:55
  */
case class Bundle(description:String, minusPrice:Double, item:Item*) extends Item