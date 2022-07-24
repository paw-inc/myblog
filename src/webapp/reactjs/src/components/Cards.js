import React from 'react';
import './Cards.css';
import CardItem from './CardItem';

function Cards() {
    return (
        <div className='cards'>
            <h1>Заваліть свої пиздаки і валіть нахуй з сайта</h1>
            <div className='cards__container'>
                <div className='cards__wrapper'>
                    <ul className='cards__items'>
                        <CardItem
                            src='images/img-1.jpg'
                            text='Zalupa Ochko Chlen'
                            label='Gavno'
                            path='/services'
                        />
                        <CardItem
                            src='images/img-1.jpg'
                            text='Zalupa Ochko Chlen'
                            label='Gavno'
                            path='/services'
                        />
                    </ul>
                    <ul className='cards__items'>
                        <CardItem
                            src='images/img-1.jpg'
                            text='Zalupa Ochko Chlen'
                            label='Gavno'
                            path='/services'
                        />
                        <CardItem
                            src='images/img-1.jpg'
                            text='Zalupa Ochko Chlen'
                            label='Gavno'
                            path='/services'
                        />
                        <CardItem
                            src='images/img-1.jpg'
                            text='Zalupa Ochko Chlen'
                            label='Gavno'
                            path='/services'
                        />
                    </ul>
                </div>
            </div>
        </div>
    );
}
export default Cards;