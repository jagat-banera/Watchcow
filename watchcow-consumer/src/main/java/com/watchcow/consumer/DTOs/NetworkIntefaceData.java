package com.watchcow.consumer.DTOs;

public record NetworkIntefaceData(String intefaceName ,
                                  double receivedBytes ,
                                  double transferBytes) {
}
